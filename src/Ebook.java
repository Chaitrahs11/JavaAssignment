
public class Ebook extends Book{

    private int fileSize;
    public Ebook(String title,String author,String isbn,boolean available,int fileSize ){
        super(title,author, isbn,available);
        this.fileSize=fileSize;
    }
    public void setFileSie(int fileSize){
        this.fileSize=fileSize;

    }
    public int getFileSize(){
        return fileSize;
    }

    @Override
    public String toString() {
        return "EBook [Title="+getTitle() +", Author=" +getAuthor()+",ISBN="+getIsbn()+", Available="+isAvailable()+", File Size="+fileSize+"mb]";
    }
}
