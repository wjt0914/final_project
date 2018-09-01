<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<script type="text/javascript">
    $(function () {
        var toolbar = [
            {
                iconCls: 'icon-add',
                text: '添加',
                handler: function () {
                    $('#dg').dialog('open');
                    /*$('#ff').form({
                        url:"/pic/add",
                        onSubmit:function(){
                            alert("ok");
                            return true;
                        },
                        success:function(data){
                            $('#dg').dialog('close');
                            $('#ff').form('clear');
                            $('#tbl').edatagrid('reload');
                        },
                        }
                    );*/
                }
            },
            {
                iconCls: 'icon-del',
                text: '删除',
                handler: function () {
                    var row = $("#tbl").edatagrid("getSelected");
                    var pid = row.id;
                    $.ajax({
                        url: '${pageContext.request.contextPath}/pic/delete',
                        type: 'post',
                        data: 'id=' + pid,
                        success: function (result) {
                            alert("result");
                            console.info(result);
                            $('#tbl').edatagrid('reload');
                        }
                    })
                }
            },
            {
                iconCls: 'icon-edit',
                text: '修改',
                handler: function () {
                    /**
                     * 使当前选中行进入可编辑模式
                     */
                    var row = $("#tbl").edatagrid("getSelected");
                    console.log(row.id);
                    if (row != null) {
                        var index = $("#tbl").edatagrid("getRowIndex", row)
                        $("#tbl").edatagrid("editRow", index)
                    } else {
                        alert("请先选中行")
                    }
                }
            },
            {
                iconCls: 'icon-save',
                text: '保存',
                handler: function () {
                    $('#tbl').edatagrid('saveRow')
                }
            }
        ]
        $("#tbl").edatagrid({
            url: "${pageContext.request.contextPath}/pic/showPic",
            columns: [[
                {field: 'id', title: '编号', width: 100},
                {field: 'title', title: '名称', width: 100},
                {field: 'description', title: '描述', width: 100},
                {field: 'uploadDate', title: '上传时间', width: 100},
                {field: 'imgPath', title: '路径', width: 100},
                {
                    field: 'status', title: '状态', width: 100, editor: {
                    type: 'text',
                    options: {
                        required: true
                    }
                }
                }
            ]],
            fit: true,
            fitColumns: true,
            pagination: true,
            pageSize: 5,
            pageList: [5, 10, 15, 20],
            toolbar: toolbar,
            view: detailview,
            detailFormatter: function (rowIndex, rowData) {
                return '<table><tr>' +
                    '<td rowspan=2 style="border:0">' +
                    '<img src="${pageContext.request.contextPath}' + rowData.imgPath + '"style="height:100px"></td>' +
                    '<td style="border:0">' +
                    '<p>上传日期:' + rowData.uploadDate + '</p>' +
                    '<p>名称: ' + rowData.title + '</p>' +
                    '<p>状态: ' + rowData.status + '</p>' +
                    '</td>' +
                    '</tr></table>';
            }
        })
    })
    function submit() {
        $("#ff").form("submit",{
            url:'${pageContext.request.contextPath}/pic/add'
        })
    }
    /*$("#confirm").click(function(){
       $("#ff").form("submit");
    });*/
</script>

<table id="tbl"></table>

<div id="dg" class="easyui-dialog" title="My Dialog" style="width:400px;height:200px;"
     data-options="resizable:true,closed:true,buttons:[{
        text:'保存',
        handler:function(){
            submit();
            $('#dg').dialog('close');
            $('#ff').form('clear');
            $('#tbl').edatagrid('reload');
        }
     },{
        text:'关闭',
        handler:function(){
            $('#dg').dialog('close');
        }
     }]">
    <form id="ff" method="post" enctype="multipart/form-data">
        <div>
            <label for="title">图片名称:</label>
            <input class="easyui-textbox" type="text" id="title" name="title" data-options="required:true"/>
        </div>
        <div>
            <label for="description">图片描述:</label>
            <input class="easyui-textbox" type="text" id="description" name="description" data-options=""/>
        </div>
        <div>
            <label for="uploadDate">上传时间:</label>
            <input class="easyui-textbox" type="text" id="uploadDate" name="uploadDate" data-options="required:true"/>
        </div>
        <div>
            <label for="pic">上传图片:</label>
            <input class="easyui-filebox" id="pic" name="pic" style="width: 200px"/>
        </div>
        <div>
            是否展示：<select class="easyui-combobox" id="status" name="status" style="width:100px">
                <option value="y">展示</option>
                <option value="n">不展示</option>
            </select>
        </div>
        <%--<div>
            <input type = "button" id = "confirm" value="submit" />
        </div>--%>
    </form>
</div>
