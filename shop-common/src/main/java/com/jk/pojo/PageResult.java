package com.jk.pojo;

import com.jk.entity.Storerank;

import java.io.Serializable;
import java.util.List;

public class PageResult implements Serializable {

	private static final long serialVersionUID = -9110655686191584922L;
	private Long total;
	private List rows;

	public Integer getPage() {
		return page;
	}

	public void setPage(Integer page) {
		this.page = page;
	}

	private Integer page;

	public Integer getPageSize() {
		return pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	private Integer pageSize;

	public Long getTotalPage() {
		return totalPage;
	}

	public void setTotalPage(Long totalPage) {
		this.totalPage = totalPage;
	}

	private Long  totalPage;

	public PageResult() {
	}

	public PageResult(Long total, List rows, Integer page, Integer pageSize, Long totalPage) {
		this.total = total;
		this.rows = rows;
		this.page = page;
		this.pageSize = pageSize;
		this.totalPage = totalPage;
	}

	public Long getTotal() {
		return total;
	}
	public void setTotal(Long total) {
		this.total = total;
	}

	public List getRows() {
		return rows;
	}

	public void setRows(List rows) {
		this.rows = rows;
	}

	@Override
	public String toString() {
		return "PageResult{" +
				"total=" + total +
				", rows=" + rows +
				", page=" + page +
				", pageSize=" + pageSize +
				", totalPage=" + totalPage +
				'}';
	}
}
