package com.spring.jpa.app.util.paginator;

import java.util.ArrayList;
import java.util.List;

import org.springframework.data.domain.Page;

public class PageRender<T> {

	private String url;
	private Page<T> page;

	private int totalPaginas;
	private int elementosPagina;
	private int paginaActual;

	private List<PageItem> paginas;

	public PageRender(String url, Page<T> page) {
		this.url = url;
		this.page = page;
		this.paginas = new ArrayList<PageItem>();
		elementosPagina = page.getSize();
		totalPaginas = page.getTotalPages();
		paginaActual = page.getNumber();

		int inicio, fin;
		if (totalPaginas <= elementosPagina) {
			inicio = 1;
			fin = totalPaginas;
		} else {
			if (paginaActual <= elementosPagina / 2) {
				inicio = 1;
				fin = elementosPagina;
			}

			else if (paginaActual >= totalPaginas - elementosPagina / 2) {
				inicio = totalPaginas - elementosPagina + 1;
				fin = elementosPagina;

			} else {
				inicio = paginaActual - elementosPagina / 2;
				fin = elementosPagina;
			}
		}
		for (int i = 0; i < fin; i++) {
			paginas.add(new PageItem(inicio + 1, paginaActual == inicio + i));
		}
	}

	public String getUrl() {
		return url;
	}

	public int getTotalPaginas() {
		return totalPaginas;
	}

	public int getPaginaActual() {
		return paginaActual;
	}

	public List<PageItem> getPaginas() {
		return paginas;
	}

	public boolean isFirst() {
		return page.isFirst();
	}

	public boolean isLast() {
		return page.isLast();
	}

	public boolean isHaxNext() {
		return page.hasNext();
	}

	public boolean ishasPrevious() {
		return page.hasPrevious();
	}
}
