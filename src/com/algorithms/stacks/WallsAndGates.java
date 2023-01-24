package com.algorithms.stacks;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

class WallsAndGates {
    int emptyRoom = Integer.MAX_VALUE;
    public static class Node{
        int i;
        int j;
        Node(int i, int j){ this.i = i; this.j=j;}
        
		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null || obj.getClass() != this.getClass())
				return false;
			Node o = (Node) obj;
			if (this.i == o.i && this.j == o.j)
				return true;
			return false;
		}

		@Override
        public int hashCode() { 
			//System.out.println(Integer.parseInt(i+""+j));
            return Integer.parseInt(i+""+j);
        }
         
    }
    
   public static void wallsAndGates(int[][] rooms) {
        for (int i = 0; i< rooms.length; i++) {
            for (int j = 0; j< rooms[i].length; j++) {
                if (rooms[i][j] ==0) {
                    fillNearByRoomsOfGate(i,j, rooms);
                }
                
            }    
        }            
    }
    
    public static void fillNearByRoomsOfGate(int i, int j, int[][] rooms){
        Queue<Node> q = new LinkedList();
        Set<Node> visited = new HashSet();
        int level = 0;
        q.add(new Node(i,j));
        q.add(null);
        while(!q.isEmpty()) {
            Node node  = q.remove();
            if (node == null) {
                if (!q.isEmpty()) {
                    level++;
                    System.out.println("level = " + level);
                    q.add(null);
                    continue;
                } else {
                    break;
                }
                
            }

            i = node.i;
            j = node.j;

            if (rooms[i][j] > level) {
                rooms[i][j] = level;
            }

            if (visited.contains(node)) {
            	continue;
            }
            
            //i++, j
            addValidNode(i+1,j, rooms,q, level, visited);
            
            //i--, j
            addValidNode(i-1,j, rooms, q,level, visited);
            
            //i, j++
            addValidNode(i,j+1, rooms, q,level, visited);
            
            //i, j--
            addValidNode(i,j-1, rooms, q,level, visited);

//            //i++, j++
//            addValidNode(i+1,j+1, rooms, q,level, visited);
//            
//            //i--, j++
//            addValidNode(i-1,j+1, rooms, q,level, visited);
//            
//            //i++, j--
//            addValidNode(i+1,j-1, rooms, q,level, visited);
//            
//            //i--, j--
//            addValidNode(i-1,j-1, rooms, q,level, visited);
            

            visited.add(node);
        }
        
    }
    
    public static void printArr(int[][] rooms) {
        for (int i = 0; i< rooms.length; i++) {
        	System.out.println("");
            for (int j = 0; j< rooms[i].length; j++) {
                    System.out.print(rooms[i][j] + ", ");
            }    
        }            
    }
    
    public static void addValidNode(int i, int j, int[][] rooms,  Queue<Node> q, int level, Set<Node> visisted) {
        if (i<0 || i>= rooms.length) return;
        if (j<0 || j>= rooms[0].length) return;
        if (rooms[i][j] == -1 || rooms[i][j] == 0) return;
        
        Node node = new Node(i, j);
       // if (visisted.contains(node)) return;
        q.add(node);
       // visisted.add(node);
        return;
    }
    
    public static void main(String[] args) {
    	int[][] rooms = {{2147483647,-1,0,2147483647},{2147483647,2147483647,2147483647,-1},{2147483647,-1,2147483647,-1},{0,-1,2147483647,2147483647}};
    	
    	wallsAndGates(rooms);
    	
    	printArr(rooms);
    	
    }
}