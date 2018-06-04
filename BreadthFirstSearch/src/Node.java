import java.util.ArrayList;

public class Node {

	public String cityName;
	Node leftChild;
	Node rightChild;
	
	public Node(String cityName, Node firstChild, Node secondChild)
	{
		this.cityName = cityName;
		this.leftChild = firstChild;
		this.rightChild = secondChild;
	}
	

    public ArrayList<node> getChildren(){
        ArrayList<node> childNodes = new ArrayList<>();
        if(this.leftChild != null)
        {
            childNodes.add(leftChild);
        }
        if(this.rightChild != null) {
            childNodes.add(rightChild);
        }
        return childNodes;
    }

    public boolean removeChild(Node n){
        return false;
    }
	
}
