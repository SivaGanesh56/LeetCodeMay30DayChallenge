/*

@Author: Siva Ganesh

Problem Link ==> https://leetcode.com/explore/challenge/card/may-leetcoding-challenge/535/week-2-may-8th-may-14th/3326/

An image is represented by a 2-D array of integers, each integer representing the pixel value of the image (from 0 to 65535).

Given a coordinate (sr, sc) representing the starting pixel (row and column) of the flood fill, and a pixel value newColor, "flood fill" the image.

To perform a "flood fill", consider the starting pixel, plus any pixels connected 4-directionally to the starting pixel of the same color as the starting pixel, plus any pixels connected 4-directionally to those pixels (also with the same color as the starting pixel), and so on. Replace the color of all of the aforementioned pixels with the newColor

*/

//Apporach: BFS

import java.util.*;

class Solution {
    
    class Node{
        int x;
        int y;
        public Node(int x,int y){
            this.x = x;
            this.y = y;
        }
    }
    
    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        if(image.length==0 || image[0].length==0) return image;
        Queue<Node> q = new LinkedList<>();
        int[] x = {1,-1,0,0};
        int[] y = {0,0,1,-1};
        q.offer(new Node(sr,sc));
        boolean[][] visited = new boolean[image.length][image[0].length];
        while(!q.isEmpty()) {       	
        	Node res = q.poll();
        	int row = res.x;
        	int col = res.y;
        	visited[row][col] = true;
        	for(int i=0;i<4;i++) {
        		int r = row+x[i];
        		int c = col+y[i];
        		if(isValid(r,c,image.length,image[0].length) && 
                                        image[r][c] == image[row][col] && !visited[r][c]){
                    q.add(new Node(r,c));
                } 
        	}
        	image[row][col] = newColor;
        }
      return image;
    }
    
    public boolean isValid(int row,int col,int rows,int cols){
        if(row<0 || row>=rows || col<0 || col>=cols){
            return false;
        }
        return true;
    }
    
    
}
