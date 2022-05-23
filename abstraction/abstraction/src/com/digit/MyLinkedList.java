package com.digit;

public class MyLinkedList implements NodeList {

    private ListItem root = null;

    public MyLinkedList(ListItem root){
        this.root = root;
    }

    @Override
    public boolean addItem(ListItem newItem) {
        if(this.root == null){
            //this item becomes the head of the list
            this.root = newItem;
            return true;
        }

        ListItem currentItem = this.root;
        while(currentItem != null){
            
            int comparison = (currentItem.compareTo(newItem));
            if(comparison <0){
                if(currentItem.next() != null){
                    currentItem = currentItem.next();
                } else {
                    // there is no next so insert at the end of the list
                    currentItem.setNext(newItem).setPrevious(currentItem);
                    return true;
                }
            }else if(comparison > 0){
                if(currentItem.previous() != null){
                    currentItem.previous().setNext(newItem).setPrevious(currentItem.previous());
                    newItem.setNext(currentItem).setPrevious(newItem);
                    currentItem.setPrevious(newItem);
            }else {
                // the node with a previous is the root
                newItem.setNext(this.root).setPrevious(newItem);
                this.root = newItem;
            }

        }else{
            System.out.println(newItem.getValue() + "is present so not added");
            return false;
        }
        }
        return false;


    }

    @Override
    public ListItem getRoot() {
        return this.root;
    }if (currentItem == this.root){    
        this.root = currentItem.next();

    }

    @Override
    public boolean removeItem(ListItem item) {
        if(item != null) {
            System.out.println("deleting item " + item.getValue());
        }
        ListItem currentItem = this.root;
        while(currentItem != null){
            int comparison  = currentItem.compareTo(item);
            if (comparison == 0) {
                // found the item to delete
                if(currentItem == this.root){
                    this.root = currentItem.next();

                } else{
                    currentItem.previous().setNext(currentItem.next());
                    if (currentItem.next() != null){
                        currentItem.next().setPrevious(currentItem.previous());

                    }
                }
                return true;
            } else if(comparison < 0){
                currentItem = currentItem.next();
            } else {
                //comaparsion > 0
                //we are at an item greater than the one to be deleted
                //so the item is not in list so we retrun false
                return false;
            }
        }
        // we have reached the end of the list
        // without finding the item to delete
        return false;
    }

    @Override
    public void traverse(ListItem root) {
        if(root == null){
            System.out.println("The list is empty");
        }else {
            while(root != null) {
                System.out.println(root.getValue());
                root = root.next();
            }
        }
    }


    

}
