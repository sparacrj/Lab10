class Main {
  public static void main(String[] args) {
    
    Sugar tree = new Sugar ();
    tree.setShape("tree");
    String treeShape = tree.getShape();
    
    tree.cut(treeShape, 10);
    
    tree.bake(350, 12);
   
    tree.decorate();
    
    Sugar aCookie = new Sugar();
    aCookie.decorate();
  }
}