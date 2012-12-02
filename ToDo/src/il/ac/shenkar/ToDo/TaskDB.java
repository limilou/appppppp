package il.ac.shenkar.ToDo;

import java.util.ArrayList;

	public class TaskDB {


			private static ArrayList<ItemDetails> taskList;
			private static TaskDB instance = null;

			private	TaskDB()
			{	
		    	taskList = new ArrayList<ItemDetails>();
	
			}
			
			public static TaskDB getInstance()
			{
				if (instance == null)
				{
					instance = new TaskDB();
				}
				return instance;
			}
			
			public void addEvent(ItemDetails newTask)
			{
				taskList.add(0,newTask);
			}
			
			public void removeEvent(int position)
			{
				
				taskList.remove(position);
			}
			
			
			public int getSize(){
				
				return taskList.size();
			}
			
			public ItemDetails getTask(int position){
				
				return taskList.get(position);
			}
			
			
	}
	 
