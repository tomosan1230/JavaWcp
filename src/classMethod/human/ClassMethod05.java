// �p�b�P�[�W�錾
package classMethod.human;

public class ClassMethod05 {
    public static void main(String[] args) {
        Human05 yamada = new Human05();  

        //name��age��private�ȕϐ��Ȃ̂Œ��ڎQ�Ƃ͂ł��Ȃ�
        //System.out.println("���O��" + yamada.name + "�ŁA�N���" + yamada.age + "�ł��B");

        //name��age���ꂼ��̒l��Ԃ�public�ȃ��\�b�h��ʂ��ĎQ�Ƃ��o�͂��邱�Ƃ͂ł���
        System.out.println("���O��" + yamada.getName() + "�ŁA�N���" + yamada.getAge() + "�ł��B");
    }
}