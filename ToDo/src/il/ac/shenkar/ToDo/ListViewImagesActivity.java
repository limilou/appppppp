package il.ac.shenkar.ToDo;

import com.jsupport.listviewimages.R;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

public class ListViewImagesActivity extends Activity {
	
	private ListView lv1;
	private ItemListBaseAdapter adapter;
	TaskDB tasksList;
	
	/** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main); // Setting the UI view with activity_task_list    
        
        lv1 = (ListView) findViewById(R.id.listV_main); // Creating the ListView
        tasksList = TaskDB.getInstance(); // Creating the tasks list
        
        adapter = new ItemListBaseAdapter(this); // Creating new adapter for the ListView
        lv1.setAdapter(adapter); // Setting the ListView Adapter
        
        Button addTaskButton = (Button) findViewById(R.id.createTaskButton); // Creating the addTask button
        
        addTaskButton.setOnClickListener(new View.OnClickListener() // Setting click listener for addTask button 
		{			
			public void onClick(View v)
			{
				Intent intent = new Intent(v.getContext(), NewTaskActivity.class); // Creating new Intent that will activate on click
				startActivity(intent); // Starting the new Activity
			}
		});
    }
    
	public void onResume()
	{
		super.onResume();
		adapter.notifyDataSetChanged(); // Refresh the ListView when resuming this activity
	}

    }
    
