
备忘录模式可以理解为一种用于记录的模式（历史记录），平时使用的world，ppt等软件都有这种记录历史的功能，能够很好的切换到之前某个节点。 
这种记录也可以和事务处理相结合，事务处理中牵扯都回滚功能，就可以使用备忘录模式。

涉及角色：
    
    Originator(发起人)：负责创建一个备忘录Memento，用以记录当前时刻自身的内部状态，并可使用备忘录恢复内部状态。Originator可以根据需要决定Memento存储自己的哪些内部状态。
    Memento(备忘录)：负责存储Originator对象的内部状态，并可以防止Originator以外的其他对象访问备忘录。备忘录有两个接口：Caretaker只能看到备忘录的窄接口，他只能将备忘录传递给其他对象。Originator却可看到备忘录的宽接口，允许它访问返回到先前状态所需要的所有数据。
    Caretaker(管理者):负责备忘录Memento，不能对Memento的内容进行访问或者操作