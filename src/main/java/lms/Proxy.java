package lms;

public class Proxy {
    //proxy acts as intermedidary
}

interface LibraryAccess{
    void requestAccess(String memberName);
}

class RealLibraryAccess implements LibraryAccess{
    @Override
    public void requestAccess(String memberName) {
        System.out.println(memberName + "got the access of library");
    }
}

class ProxyLibraryAccess implements LibraryAccess{
    private RealLibraryAccess realLibraryAccess;
    private String memberName;

    public ProxyLibraryAccess(String memberName){
        this.memberName = memberName;
    }
    @Override
    public void requestAccess(String memberName) {
        if(isValidMember()){
            realLibraryAccess = new RealLibraryAccess();
            realLibraryAccess.requestAccess(memberName);
        }else{
            throw new AccessDeniedException("Access denied for " + memberName);
        }
    }

    private boolean isValidMember() {
        //complex logic for Autorization
        return true;
    }
}