<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/8/30 0030
  Time: 下午 5:22
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" pageEncoding="utf-8" %>
<style type="text/css">
    .input{
        margin-top: 10px;
    }
</style>
<script type="text/javascript">
    $(function () {
        var toolbar = [
            {
                iconCls: 'icon-picture',
                text: '专辑详情',
                handler: function () {
                    var row2 = $("#tb").edatagrid("getSelected");
                    console.log(row2);
                    if (row2 != null) {
                        if(row2.author!=null){
                            $('#album_dg').dialog('open');
                            $('#fom').form('load',row2);
                            $('#img').prop('src','${pageContext.request.contextPath}/picture/'+row2.coverage)
                        }else{
                            alert("请选中专辑")
                        }
                    } else {
                        alert("请先选中行")
                    }
                }
            },
            {
                iconCls: 'icon-help',
                text: '添加章节',
                handler: function () {

                }
            },
            {
                iconCls: 'icon-add',
                text: '添加专辑',
                handler: function () {

                }
            },
            {
                iconCls: 'icon-reload',
                text: '下载音频',
                handler: function () {
                    var row3 = $("tb").treegrid("getSelected");
                    if(row3!=null){
                        if(row3.author==null){
                            location.href=''
                        }else {
                            alert("请选中要下载的音频");
                        }
                    }else{
                        alert("请选中行")
                    }
                }
            }
        ]

        $('#tb').treegrid({
            url: '${pageContext.request.contextPath}/album/showA',
            idField: "id",
            treeField: "title",
            animate:true,
            toolbar:toolbar,
            columns: [[
                {field: 'title', title: '名称', width: 50},
                {field: 'size', title: '文件大小', width: 50},
                {field: 'duration', title: '时长', width: 50},
                {field: 'path', title: '路径', width: 50}
            ]],
            fit: true,
            fitColumns: true,
            pagination:true,
            pageSize:2,
            pageList:[1,2,3,4]

        });
    })
</script>

<table id="tb" style="width:600px;height:400px"></table>
<div id="album_dg" class="easyui-dialog" title="My Dialog" style="width:300px;height:360px;"
     data-options="iconCls:'icon-save',resizable:true,modal:true,closed:true">
    <div class="input" style="color: #00bbee">专辑详情：</div>
        <form id="fom" method="post" enctype="multipart/form-data">
            <div style="text-align: center" class="input">
                <label for="title">专辑名称:</label>
                <input class="easyui-textbox" type="text" id="title" name="title" data-options="" style="width: 150px"/>
            </div>
            <div style="text-align: center" class="input">
                <label for="count">专辑集数:</label>
                <input class="easyui-textbox" type="text" id="count" name="count" data-options="" style="width: 150px"/>
            </div>
            <div style="text-align: center" class="input">
                <label for="coverage">专辑封面:</label>
                <input class="easyui-textbox" type="text" id="coverage" name="coverage" data-options="" style="width: 150px"/>
            </div>
            <div style="text-align: center" class="input">
                <label for="score">专辑评分:</label>
                <input class="easyui-textbox" id="score" name="score" style="width: 150px"/>
            </div>
            <div style="text-align: center" class="input">
                <label for="author">专辑作者:</label>
                <input class="easyui-textbox" id="author" name="author" style="width: 150px"/>
            </div>
            <div style="text-align: center" class="input">
                <label for="announcer">播音员:</label>
                <input class="easyui-textbox" id="announcer" name="announcer" style="width: 150px"/>
            </div>
            <div style="text-align: center" class="input">
                <label for="brief">内容简介:&nbsp;</label>
                <input class="easyui-textbox" id="brief" name="brief" style="width: 150px"/>
            </div>
            <div style="text-align: center" class="input">
                <label for="publishDate">发布时间:</label>
                <input class="easyui-datebox" id="publishDate" name="publishDate" style="width: 150px"/>
            </div>
        </form>
    </div>
