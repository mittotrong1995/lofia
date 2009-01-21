public class FPItemSet {
	double support;
	short [] items;
	public FPItemSet(short [] i, double s)
	{
		items = i;
		support = s;
	}
	public String toString()
	{
		if (items== null)
			return "Empty itemset...";
		String res = "";
		for (int i = 0; i < items.length; i++ ) {
			res += items[i] + " ";
		}
		res += "(" + support +")";
		return res;
	}
}
