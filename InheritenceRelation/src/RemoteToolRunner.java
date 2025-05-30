public class RemoteToolRunner {
    public static void main(String[] args) {

        int accessALl= RemoteTool.REMOTE_CONTROL|RemoteTool.FILE_ACCESS|RemoteTool.SCREEN_SHARING;
        int zoomTool= RemoteTool.FILE_ACCESS;

        ZoomTool zt=new ZoomTool(zoomTool);
        TeamViewerTool tv=new TeamViewerTool(accessALl);

        zt.getPermissions();
        System.out.println();
        tv.getPermissions();
    }
}
