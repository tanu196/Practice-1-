import java.io.Serializable;

public class Item implements Serializable {
	private static final long serialVersionUID = 1l;

	private int itemId;
	private String itemName;
	private int quantity;

	public Item(int itemId, String itemName, int quantity) {
		this.itemId = itemId;
		this.itemName = itemName;
		this.quantity = quantity;
	}

	public int getItemId() {
		return itemId;
	}

	public String getItemName() {
		return itemName;
	}

	public int getQuantity() {
		return quantity;
	}
	
	
	public String toString() {
		return "商品番号：" + itemId + "、商品名：" + itemName + "、数量：" + quantity;
	}

}
