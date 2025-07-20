class MyLinkedList {
    Node head;
   
    int size=0;
    public MyLinkedList() {
        head=null;
        

    }
    
    public int get(int index) {
        if(index>=size || index<0) return -1;
        Node temp=head;
        for(int i=0;i<index;i++){
            temp=temp.next;
        }
        return temp.val;
    }
    
    public void addAtHead(int val) {
        size++;
        Node temp=new Node(val);
        temp.next=head;
        head=temp;
    }
    
    public void addAtTail(int val) {
        if(head==null){
            Node temp=new Node(val);
            head=temp;
            size++;
            return;
        }
        size++;
        Node temp=new Node(val);
        Node node=head;
        while(node.next!=null){
            node=node.next;
        }
        node.next=temp;
        temp.next=null;
    }
    
    public void addAtIndex(int index, int val) {
        if(index<0 || index>size) return;
        if(index==0) addAtHead(val);
        else if(index==size) addAtTail(val);
        else{
        size++;
        Node temp=head;
        for(int i=0;i<index-1;i++){
            temp=temp.next;
        }
        Node node=temp.next;
        Node insert=new Node(val);
        temp.next=insert;
        insert.next=node;
    }
    }
    
    public void deleteAtIndex(int index) {
        if (index < 0 || index >= size) return;

        if (index == 0) {
            head = head.next;
        }
        else{
        Node temp=head;

        for(int i=0;i<index-1;i++){
            temp=temp.next;
        }
        temp.next=temp.next.next;
        }
        size--;
    }
    class Node{
        int val;
        Node next;
        
        public Node(int val){
            this.val=val;
        }
    }
}

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */