// BlueJ project: lesson3/friends3
public class Person
{
    private String name;
    private String friends;

     
    public Person(String aName, String pictureName, int xCoord, int yCoord)
    {
        name = aName;
        friends = "";
        Picture picture = new Picture(pictureName);
        picture.translate(xCoord,yCoord);
        picture.draw();

    }
    
    public void addFriend(Person friend) 
    {
        friends = friends + friend.name + " ";

    }
    
    public void unfriend(Person nonFriend)
    {
        friends = friends.replace(nonFriend.name + " ", "");
    }
    
    public String getFriends() 
    {
        return friends;
    }
}