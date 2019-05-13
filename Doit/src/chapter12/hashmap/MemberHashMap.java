package chapter12.hashmap;

import java.util.HashMap;
import java.util.Iterator;

import chapter12.Member;

public class MemberHashMap {
    private HashMap<Integer, Member> hashMap;

    public MemberHashMap(/*HashMap<Integer, Member> hashMap*/) {
        //this.hashMap = hashMap;
        hashMap = new HashMap<Integer, Member>();
    }

    public void addMember(Member member) {
        hashMap.put(member.getMemberID(), member); // key-value 쌍으로 추가. HashMap에 회원 추가하는 메서드
    }

    public boolean removeMember(int memberID) {
        if (hashMap.containsKey(memberID)) { // HashMap에 매개변수로 받은 키 값인 회원 아이디가 있다면
            hashMap.remove(memberID); // 해당 회원 삭제
            return true;
        }
        System.out.printf("%d가 존재하지 않습니다.\n",memberID);
        return false;
    }

    public void showAllMember() {
        Iterator<Integer> ir = hashMap.keySet().iterator();
        while (ir.hasNext()){ // 다음 key가 있으면
            int key = ir.next(); // key 값을 가져와서
            Member member = hashMap.get(key); // key로부터 value 가져오기
            System.out.println(member);
        }
        System.out.println();
    }
}
// 모든 자료를 순회하려면 key 값을 먼저 가져와서, key 값에 해당하는 value를 찾아야 한다.
// 이 외에 HashMap의 value() 메서드를 사용하면, key 값 없이 모든 value 값을 Collection 자료형으로 반환해 준다.