/**
 * Created by jaliya on 8/15/17.
 */
$(document).ready(function() {
    $('#example').DataTable( {
        "processing": true,
        "serverSide": true,
        "ajax": "http://localhost:8080/pms-web/create_tasks/generate"
    } );
 }
);