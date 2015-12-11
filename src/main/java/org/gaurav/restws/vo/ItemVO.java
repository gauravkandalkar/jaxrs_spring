package org.gaurav.restws.vo;

import java.util.List;

public class ItemVO {
	private long itemId;
	private String itemName;
	private List<String> iteamType;
	private long mrp;

	public long getItemId() {
		return itemId;
	}

	public void setItemId(long itemId) {
		this.itemId = itemId;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public List<String> getIteamType() {
		return iteamType;
	}

	public void setIteamType(List<String> iteamType) {
		this.iteamType = iteamType;
	}

	public long getMrp() {
		return mrp;
	}

	public void setMrp(long mrp) {
		this.mrp = mrp;
	}
}
