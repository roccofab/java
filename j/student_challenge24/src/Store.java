public class Store {
    Member members[] = new Member[100];
    int count = 0;
    void addMember(Member member){
        members[count] = member;
        count++;
    }
    Member getMember(int index){
        return members[index];
    }
    void inviteSale(){
        for(int i = 0; i <count; i++){
            members[i].callback();
        }
    }
}
