// Generated by GraphWalker (http://www.graphwalker.org)
package com.mbt;

import org.graphwalker.java.annotation.Edge;
import org.graphwalker.java.annotation.Model;
import org.graphwalker.java.annotation.Vertex;

@Model(file = "com/mbt/Notepad.graphml")
public interface Notepad {

    @Vertex()
    void v_Start();

    @Edge()
    void e_Init();
	
	@Vertex()
    void v_StartNotepad();

    @Edge()
    void e_StartNotepad();
	
	@Vertex()
    void v_NotepadRunning();

    @Edge()
    void e_Create();
	
	@Vertex()
    void v_Create();

    @Edge()
    void e_Save();
	
	@Vertex()
    void v_Save();

    @Edge()
    void e_Close();
	
	@Vertex()
    void v_Edit();

    @Edge()
    void e_Edit();
	
	@Edge()
    void e_SaveEdit();
	
	@Edge()
    void e_Exit();
	
	@Edge()
    void e_Postclose();
	
	@Vertex()
    void v_Close();
    
}
