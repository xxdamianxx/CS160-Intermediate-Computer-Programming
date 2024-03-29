import java.util.ArrayList;
import java.util.List;

public class BFSearch {

	public Integer nodeExpansionCount;
	private Map map;
	private String initialLoc;
	private String destinationLoc;
	private int limit;
	private Frontier frontier;

	public BFSearch(Map graph, String initialLoc, String destinationLoc, int limit) {
		this.map = graph;
		this.initialLoc = initialLoc;
		this.destinationLoc = destinationLoc;
		this.limit = limit;
		this.frontier = new Frontier();
		this.nodeExpansionCount = 0;
	}

	public Node search(boolean b) {
		//it takes a single boolean argument — if this argument is “true”, then repeated state
		//checking should be performed, otherwise no such checking should be done during
		//search
		
		//a public integer instance variable called nodeExpansionCount that contains the number
		//of node expansions performed during the most recent call to the search method 
		//Location location = map.findLocation(initialLoc);
		Node returnNode = null;
		List<String> visited = new ArrayList<String>();
		Node startingNode = new Node();
		startingNode.loc = map.findLocation(initialLoc);
		startingNode.parent = null;
		startingNode.children = new ArrayList<Node>();
		startingNode.depth = 0;
		startingNode.partialPathCost = 0.0;
		startingNode.expand();
		nodeExpansionCount = 0;
		frontier.addToTop(startingNode);
		while(returnNode == null && frontier.fringe.size() > 0 && nodeExpansionCount < limit) {
			Node currentNode = frontier.removeTop();
			if (!visited.contains(currentNode.loc.name)){
				if(currentNode.isDestination(this.destinationLoc)) {
					returnNode = currentNode;
				}else {
					// Expand node
					currentNode.expand();
					// Increase expansion count
					nodeExpansionCount += 1;
					if (currentNode.children.size() > 0 && currentNode.parent != null && currentNode.children.get(0).loc.name.equalsIgnoreCase(currentNode.parent.loc.name)) {
						currentNode.children.remove(0);
					}
					// Add children to frontier
					frontier.addToBottom(currentNode.children);
				}
			}
			
		}
		return returnNode;
	}
}
