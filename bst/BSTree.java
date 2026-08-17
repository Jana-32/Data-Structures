package bst;

public class BSTree<K extends Comparable<K>, E> {

    private BSTNode<K, E> root;

    public BSTNode<K, E> getRoot() {
        return root;
    }
    //=================================================================
    public int size(BSTNode<K, E> root){
    if(root==null){return 0;}
    
    return 1+size(root.getLeft())+size(root.getRight());
    }
    //========================================================================

    public E search(K k) { 			                // "wrapper method" 
        BSTNode<K, E> n = searchTree(root, k); 	// get Node for key 
        if (n == null) {
            return null; 			// no such key 
        } else {
            return n.getData(); 			// return list of values for key 
        }
    }

    private BSTNode searchTree(BSTNode<K, E> root, K key) {
        // Base Cases: root is null or key is present at root 
        if (root == null || root.getKey() == key) {
            return root;
        }
        if (root.getKey().compareTo(key) > 0) {
            return searchTree(root.getLeft(), key);
        }

        return searchTree(root.getRight(), key);

    }

    //============================
    // "wrapper method" 
    // public  E Search(K key)
//{	
//BSTNode temp=root;
//
//while(temp!=null)
//{
//     if((Integer)temp.getKey()>(Integer)key)
//     temp=temp.getLeft(); 
//else
//     if((Integer)temp.getKey()<(Integer)key)
//     temp=temp.getRight();
//else
//    return (E)temp.getData();
//}
//return null;
//
//}
    //==============================
    public void insert(K key, E data) {
        BSTNode<K, E> parent = null;
        BSTNode<K, E> trav = root;
        while (trav != null) {
            parent = trav;
            if (key.compareTo(trav.getKey()) < 0) {
                trav = trav.getLeft();
            } else {
                trav = trav.getRight();
            }
        }

        BSTNode<K, E> newNode = new BSTNode<K, E>(key, data);
        if (root == null) {
            root = newNode;
        } else if (parent.getKey().compareTo(key) > 0) {
            parent.setLeft(newNode);
        } else {
            parent.setRight(newNode);
        }

    }
    //===========================================

    public void print() {

        print(root);
    }

    private void print(BSTNode root) {
        if (root != null) {
            print(root.getLeft());
            System.out.println(root.getData());
            print(root.getRight());
        }

    }
    //========================================

    public E delete(K key) {
        BSTNode<K, E> parent = null;
        BSTNode<K, E> trav = root;
        while (trav != null && trav.getKey() != key) {
            parent = trav;
            if (key.compareTo(trav.getKey()) < 0) {
                trav = trav.getLeft();
            } else {
                trav = trav.getRight();
            }
        }
        if (trav == null) {
            return null;
        } else {
            E removedData = trav.getData();
            deleteNode(trav, parent); // call helper method
            return removedData;
        }
    }

    private void deleteNode(BSTNode<K, E> toDelete, BSTNode<K, E> parent) {
        if (toDelete.getLeft() != null && toDelete.getRight() != null) {
// Find a replacement – and the replacement's parent.
            BSTNode<K, E> replaceParent = toDelete;
            BSTNode<K, E> replace = toDelete.getRight();
// what should go here?
            while (replace.getLeft() != null) {
                replaceParent = replace;
                replace = replace.getLeft();
            }
            toDelete.setKey(replace.getKey());
            toDelete.setData(replace.getData());

            deleteNode(replace, replaceParent);
        } else {
            BSTNode<K, E> toDeleteChild;
            if (toDelete.getLeft() != null) {
                toDeleteChild = toDelete.getLeft();
            } else {
                toDeleteChild = toDelete.getRight();
            }
// Note: in case 1, toDeleteChild will have a value of null.
            if (toDelete == root) {
                root = toDeleteChild;
            } else if (toDelete.getKey().compareTo(parent.getKey()) < 0) {
                parent.setLeft(toDeleteChild);
            } else {
                parent.setRight(toDeleteChild);
            }
        }
    }

    //=================================================
// find max value
    public E findMin() {
        return minValue(root);
    }
//======================================

//    private E minValue(BSTNode root) {
//        if (root == null) 
//            return null;
//        
//        if (root.getLeft() == null) 
//            return (E) root.getData();
//       
//        return minValue(root.getLeft());
//    }
    //==================================
    private E minValue(BSTNode root) {
        if (root == null) {
            return null;
        }

        while (root.getLeft() != null) {
            root = root.getLeft();
        }
        return (E) root.getData();
    }
    //========================================

    public E findMax() {
        return maxValue(root);
    }
    //============================
    private E maxValue(BSTNode root) {
        if (root == null) {
            return null;
        }
        
        while (root.getRight() != null) {
            root = root.getRight();
        }

        return (E) root.getData();
    }

//===================================================
    public boolean IsBST() {
        return isBST(root);
    }
//====================================================

    public boolean isBST(BSTNode root) {
        if (root == null) {
            return false;
        }
        if (root.getLeft() != null && (Integer) maxValue(root.getLeft()) > (Integer) root.getKey()) {
            return false;
        }
        if (root.getRight() != null && (Integer) minValue(root.getRight()) < (Integer) root.getKey()) {
            return false;
        }
        isBST(root.getRight());
        isBST(root.getLeft());
        return true;
    }

}
