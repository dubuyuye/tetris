/**   
 * @fileName Box_Button.java
 * @package com.sllx.tetris.config
 * @copyright (c) 2014, sincerebravefight@gmail.com All Rights Reserved. 
 * @description 按钮
 * @author sllx  
 * @date 2014-5-9 下午1:48:04
 * @modifiedBy sllx
 * @ModifiedDate 2014-5-9 下午1:48:04
   * Why & What is modified
 * @version V1.0
 */
package com.sllx.tetris.ui;

import java.awt.Graphics;



/**
 * @className Box_Button
 * @description 按钮
 * @author sllx
 * @date 2014-5-9 下午2:25:00
 * @modifiedBy sllx
 * @ModifiedDate 2014-5-9 下午2:25:00
   * Why & What is modified
 */
class Box_Button extends Box{


	/**
	 * @title Box_Button
	 * @description 构造器
	 * @param x
	 * @param y
	 * @param w
	 * @param h    
	 */
	public Box_Button(int x, int y, int w, int h) {
		super(x, y, w, h);
	}
	
	/* (non-Javadoc)
	 * description 绘制
	 * @see com.sllx.tetris.ui.Box#paint(java.awt.Graphics)
	 */
	@Override
	protected void paint(Graphics g){
		this.createWindow(g);
	}
}
