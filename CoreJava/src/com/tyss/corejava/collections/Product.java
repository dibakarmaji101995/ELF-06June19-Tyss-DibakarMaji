package com.tyss.corejava.collections;

import lombok.Data;

@Data
public class Product implements Comparable<Product> {
	private String prodName;
	private Integer prodCost;
	private Double rating;

	public Product(String prodName, Integer prodCost, Double rating) {
		super();
		this.prodName = prodName;
		this.prodCost = prodCost;
		this.rating = rating;
	}

	/* compare w.r.t rating */
	/*
	 * @Override public int compareTo(Product o) { return
	 * this.rating.compareTo(o.rating); }
	 */

	@Override
	public int compareTo(Product o) {
		if (this.rating < o.rating) {
			return 1;
		} else if (this.rating > o.rating) {
			return -1;
		} else {
			return 0;
		}
	}
}
