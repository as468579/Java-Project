package GameState;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.Panel;
import java.awt.event.KeyEvent;

import Main.GamePanel;
import TileMap.Background;

public class Ending2State extends GameState{
	
	private Background bg;
	private Color titleColor;
	private Color escColor;
	private Font titleFont;
	private Font escFont;
	
	public Ending2State(GameStateManager gsm){
		this.gsm = gsm;
		init();
	}

	@Override
	public void init() {
		System.out.println("ending2");
		
		bg = new Background("/Backgrounds/background_1_7.gif",0.5);
		bg.setPosition(0, 0);
		
		titleColor = new Color(128,0,0);
		escColor = new Color(255, 255, 255);
		escFont = new Font(
				"Century Gothic",
				Font.PLAIN,
				10);
		titleFont = new Font(
				"utf-8",
				Font.BOLD,
				20);
		
	}
	
	@Override
	public void update() {
		bg.update();
		
	}
	
	@Override
	public void draw(Graphics2D g) {
		bg.draw(g);
		
		g.setColor(escColor);
		g.setFont(escFont);
		g.drawString("Press 'esc' to return menu", 0, GamePanel.HEIGHT);
		
		g.setColor(titleColor);
		g.setFont(titleFont);
		g.drawString("�a����", GamePanel.WIDTH/2 - 50, 30);
		g.drawString("�v�屼�J�������a�U�@�ɡA������", 0, 60);
		g.drawString("�~���ͻH�]�a�F�A���F�k���i�Ȫ�", 0, 90);
		g.drawString("�U���D�A�L�u���~��e�i�A�M��", 0, 120);
		g.drawString("��L�k������kQQ�C", 0, 150);
	}
	@Override
	public void keyPressed(int k) {
		if( k == KeyEvent.VK_ESCAPE) gsm.setStates(GameStateManager.MENUSTATE);
	}
	
	@Override
	public void keyReleased(int k) {
		
	}
	

}
