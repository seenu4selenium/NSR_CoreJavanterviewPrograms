package oopsConcepts;

public abstract class Abstract_Parent_Animal {
	// Abstraction is a process which displays only the information needed
		// and hides the unnecessary information.
		// We can say that the main purpose of abstraction is data hiding.
		// Abstraction means selecting data from a large number of data to show the
		// information needed,which helps in reducing programming complexity and
		// efforts.

//		eg:
//			Suppose we want to create a student application and ask to collect information about the student.
//			We collect the following information.  
		// Name
		// Class
		// Address
		// Dob
		// Fathers name
		// Mothers’ names and so on.
//			We may not require every information that we have collected to fill out the application. 
		// So, we select the data that is required to fill out the application. Hence,
		// we have fetched,
		// removed, and selected the data, the student information from large data.
		// This process is known as abstraction in the oops concept.

		public abstract void sound();
}
