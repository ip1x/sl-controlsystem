Sortable.create(boardCards, {
    ghostClass: 'ghost',
    animation: 150,
    handle: ".header"
});

$('#boardCards .stickers').each(function (i,e){
    Sortable.create(e, {
        group: 'blocks',
        animation: 150
    });
});