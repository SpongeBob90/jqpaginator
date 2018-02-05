$(function () {
    $.jqPaginator('#pagination', {
        totalPages: 5,
        visiblePages: 3,
        currentPage: 1,
        onPageChange: function (num, type) {
            console.log(num);
            console.log(type);
        }
    });
});