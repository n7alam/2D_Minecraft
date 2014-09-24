/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pkg2d_minecraft_game;

import java.awt.*;

/**
 *
 * @author SAlam
 */
public class Level
{   
    //private static final long serialVersionUID = 1L;
    
    public Block[][] block = new Block[50][50];
    
    public Level()
    {
        for(int x=0; x<block.length; x++)
        {
            for(int y=0; y<block[0].length; y++)
            {
                block[x][y] = new Block(new Rectangle(x*Tile.tileSize, y*Tile.tileSize, Tile.tileSize, Tile.tileSize), Tile.earth);
            }
        }
        
        generateLevel();
    }
    
    public void generateLevel()
    {
        for(int x=0; x<block.length; x++)
        {
            for(int y=0; y<block[0].length; y++)
            {
                if(x==0 || y==0 || x==block.length-1 || y==block[0].length-1)
                {
                    block[x][y].id = Tile.earth;
                }
            }
        }
    }
    
    public void tick()
    {
        
    }
    
    /**
     *
     * @param g
     */
    public void render(Graphics g)
    {
        for(int x=0; x<block.length; x++)
        {
            for(int y=0; y<block[0].length; y++)
            {
                block[x][y].render(g);
            }
        }
    }
    
    //public static void main(String args[])
    //{

    //}
    
}
