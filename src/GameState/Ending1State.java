package GameState;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.Panel;
import java.awt.event.KeyEvent;

import Main.GamePanel;
import TileMap.Background;

public class Ending1State extends GameState{
	
	private Background bg;
	private Color titleColor;
	private Color escColor;
	private Font titleFont;
	private Font escFont;
	
	public Ending1State(GameStateManager gsm){
		this.gsm = gsm;
		init();
	}

	@Override
	public void init() {
		System.out.println("ending");
		
		bg = new Background("/Backgrounds/grassbg1.gif",0.5);
		bg.setPosition(0, 0);
		
		titleColor = new Color(0,0,0);
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
		g.drawString("�@�뵲��", GamePanel.WIDTH/2 - 50, 30);
		g.drawString("�v��o��F�������ͻH�A���X�M�I", 0, 60);
		g.drawString("���a�U�D�A�g�L�o���i�Ȫ��_�I�A", 0, 90);
		g.drawString("�L�M�w�����������`�����q�u�A", 0, 120);
		g.drawString("���U�j�a�B�z�U���D�����c���ͪ��C", 0, 150);
	}
	@Override
	public void keyPressed(int k) {
		if( k == KeyEvent.VK_ESCAPE) gsm.setStates(GameStateManager.MENUSTATE);
	}
	
	@Override
	public void keyReleased(int k) {
		
	}
	

}
