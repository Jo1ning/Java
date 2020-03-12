关于git与github:

1).ssh/id_rsa和.ssh/id_rsa.pub在文件中找不到问题：
在终端输入：open ～/.ssh
2)link git and github:
    a) cd 到要上传的项目的目录
    b）git clone git@github.com:github名字/仓库名.git
    a,b）步骤将这个仓库给clone到你cd的路径
    c）将要上传的文件添加到该仓库中
    d) cd到上传文件所在仓库里的路径
    e) //文件添加到仓库（.代表提交所有文件）
        git add .
        //把文件提交到仓库
        git commit -m "First Commit"
        //上传到github
        git push
完成✅