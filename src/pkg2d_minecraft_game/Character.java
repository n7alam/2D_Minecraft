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
public class Character extends DoubleRectangle
{
    public double fallingSpeed = 0.5;
    
    public Character(int width, int height)
    {
        setBounds((Component.pixel.width/2) - (width/2),(Component.pixel.height/2) - (height/2), width, height);
    }
    
    public void tick()
    {
        y += fallingSpeed; 
    }
    
    public void render(Graphics g)
    {
        g.drawImage(Tile.tileset_terrain, (int) x, (int) y, (int) (x + width), (int) (y + height), Tile.character[0]*Tile.tileSize, Tile.character[1]*Tile.tileSize, Tile.character[0]*Tile.tileSize + (int)width, Tile.character[1]*Tile.tileSize + (int) height, null);
    }
}
