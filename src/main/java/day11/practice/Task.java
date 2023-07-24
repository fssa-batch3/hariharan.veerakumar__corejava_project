package day11.practice;

public class Task {
	
	public int id;
    public String name;
    public String status;

    public Task(int id, String name, String status){
        this.id = id;
        this.name = name;
        this.status = status;
    }
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getStatus() {
        return status;
    }

}
