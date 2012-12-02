package il.ac.shenkar.ToDo;

import com.jsupport.listviewimages.R;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class NewTaskActivity extends Activity {
	
	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_new_task); // Setting the UI view with create_task_list

		Button createTaskButton = (Button) findViewById(R.id.saveTaskButton); //Creating the 'create' button
		createTaskButton.setOnClickListener(new View.OnClickListener() // Setting click listener for addTask button 
		{			
			public void onClick(View v)
			{
				EditText textField = (EditText) findViewById(R.id.edit_message);
				ItemDetails newTask= new ItemDetails (textField.getText().toString());

				TaskDB array = TaskDB.getInstance();
				array.addEvent(newTask);

				finish();
			}
		});
	}

}
