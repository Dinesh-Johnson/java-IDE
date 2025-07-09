public class RemoteTool {

    //Employees use remote tools with access levels like screen sharing, file access, or remote control.
    //
    //Concepts Tested:
    //
    //RemoteTool class stores permissionFlags (bitmask).
    //
    //Subclasses like ZoomTool and TeamViewerTool override getPermissions().
    //
    //Use constructor chaining to pass app version and access level.
    //
    //Bitwise logic identifies available privileges.
    String version;
    int permissionFlags;
    public static int SCREEN_SHARING=1;
    public static int FILE_ACCESS=2;
    public static int REMOTE_CONTROL=4;

    public RemoteTool(String version, int permissionFlags) {
        this.version = version;
        this.permissionFlags = permissionFlags;
    }

    public void getPermissions() {
        System.out.println("Remote Tools Permissions");
        if ((permissionFlags & SCREEN_SHARING)!=0){
            System.out.println("SCREEN SHARING");
        }
        if ((permissionFlags & FILE_ACCESS)!=0){
            System.out.println("FILE ACCESS");
        }
        if ((permissionFlags & REMOTE_CONTROL)!=0){
            System.out.println("REMOTE CONTROL");
        }
    }
}
