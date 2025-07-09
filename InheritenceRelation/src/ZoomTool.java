public class ZoomTool extends RemoteTool{

    public ZoomTool(int permissionFlags) {
        super("1.8", permissionFlags);
    }
    @Override
    public void getPermissions() {
        System.out.println("Zoom Tool " + version + " Permissions:");
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
