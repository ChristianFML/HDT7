public class BinaryTree<E>{
	
protected E val;
protected BinaryTree<E> parent,left,right;


	public BinaryTree() {
		// Se genera un nodo vacio.
		
		val = null;
		parent = null;
		left=right=this;
	}
	
	public BinaryTree(E valor) {
		// TODO Auto-generated constructor stub
		
		val = valor;
		right=left= new BinaryTree<E>();
		setLeft(left);
		setRight(right);
		
	}

	public BinaryTree(E valor, BinaryTree<E> left, BinaryTree<E> right) {
		// TODO Auto-generated constructor stub
		val=valor;
		if(left==null){
			left = new BinaryTree<E>();
		}
		
		setLeft(left);
		
		if(right == null){
			right = new BinaryTree<E>();
		}
		
		setRight(right);
		
	}
	
	public BinaryTree<E> left(){
		
		return left;
		
	}
	
	public BinaryTree<E> parent(){
		
		return parent;
	}
	
	public BinaryTree<E> right(){
		
		return right;
		
	}
	
	public void setLeft(BinaryTree<E> newLeft){
		
		if(isEmpty()){
			return;
		}
		if (left != null && left.parent() == this){
			left.setParent(null);
			left = newLeft;
			left.setParent(this);
		}
	}
	
	public void setRight(BinaryTree<E> newRight){
		
		if(isEmpty()){
			return;
		}
		if (right != null && right.parent() == this){
			right.setParent(null);
			right = newRight;
			right.setParent(this);
		}
	}
	
	public void setParent(BinaryTree<E> newParent){
		if (!isEmpty()){
			parent=newParent;
		}
	}
	
	
	public E value(){
		return val;
		
	}
	public void setValue(E valor){
		val=valor;
	}

	public boolean isEmpty(){
		boolean empty=false;
		if(parent==null)
			empty=true;
		else
			return empty;
		return empty;
		
	}

}