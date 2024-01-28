import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DFSearch {
	
	public Integer nodeExpansionCount;
	private Map map;
	private String initialLoc;
	private String destinationLoc;
	private int limit;
	private Frontier frontier;
	
	public DFSearch(Map graph, String initialLoc, String destinationLoc, int limit) {
		this.map = graph;
		this.initialLoc = initialLoc;
		this.destinationLoc = destinationLoc;
		this.limit = limit;
		this.frontier = new Frontier();
		this.nodeExpansionCount = 0;
	}

	public Node search(boolean b) {
		List<Node> children;
		List<String> visited = new ArrayList<String>();
		Node returnNode = null;
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
			// Check if it has been visited already
			if (!visited.contains(currentNode.loc.name)){
				// If not add to visited
				visited.add(currentNode.loc.name);
				if(currentNode.isDestination(this.destinationLoc)) {
					returnNode = currentNode;
				}else {
					// Expand node
					currentNode.expand();
					// Add to visited
					// Increase expansion count
					nodeExpansionCount += 1;
					// Add children to frontier
					// Remove parent node
					if (currentNode.children.size() > 0 && currentNode.parent != null && currentNode.children.get(0).loc.name.equalsIgnoreCase(currentNode.parent.loc.name)) {
						currentNode.children.remove(0);
					}
					children = currentNode.children;
					Collections.reverse(children);
					frontier.addToTop(children);
				}
			}
		}
		return returnNode;
	}
}
