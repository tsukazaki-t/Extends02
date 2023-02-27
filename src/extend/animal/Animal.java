package extend.animal;

//抽象クラスの場合、abstract＋クラス名
public abstract class Animal {

	//public static void main、、、はabstractのときいらない	
		protected String name;

		public void eat() {
			System.out.println(name + "が食事をしました！");
		}

		public abstract void cry();

	

}
