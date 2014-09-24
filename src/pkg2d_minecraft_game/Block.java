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
public class Block extends Rectangle
{   
    private static final long serialVersionUID = 1L;
    
    public int[] id = {-1, -1};
    
    public Block(Rectangle size, int[] id)
    {
        setBounds(size);
        this.id = id;
    }
    
    public void render(Graphics g)
    {
        if(id != Tile.air)
        {
            g.drawImage(Tile.tileset_terrain, x - Component.sX, y - Component.sY, x + width - Component.sX, y + height - Component.sY, id[0]*Tile.tileSize, id[1]*Tile.tileSize, id[0]*Tile.tileSize + Tile.tileSize, id[1]*Tile.tileSize + Tile.tileSize, null);
        }
        
    }
}
