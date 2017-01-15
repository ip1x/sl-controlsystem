//Sortable for cards on board.
Sortable.create(boardCards, {
    ghostClass: 'ghost',
    animation: 150,
    handle: ".header",
    // Element is chosen
            onChoose: function (/**Event*/evt) {
                console.log("onChoose:\noldIndex = " + evt.oldIndex);  // element index within parent
            },

            // Element dragging started
            onStart: function (/**Event*/evt) {
                console.log("onStart:\noldIndex = " + evt.oldIndex);  // element index within parent
            },

            // Element dragging ended
            onEnd: function (/**Event*/evt) {
                console.log("onEnd:");
                console.log("oldIndex = " + evt.oldIndex);  // element's old index within parent
                console.log("newIndex = " + evt.newIndex);  // element's new index within parent
            },

            // Element is dropped into the list from another list
            onAdd: function (/**Event*/evt) {
                var itemEl = evt.item;  // dragged HTMLElement
                evt.from;  // previous list
                // + indexes from onEnd
                console.log("onAdd:\ndragged el:");
                console.log(evt.item);
                console.log("previous list:");
                console.log(evt.from);
                console.log("event:");
                console.log(evt);
            },

            // Changed sorting within list
            onUpdate: function (/**Event*/evt) {
                var itemEl = evt.item;  // dragged HTMLElement
                // + indexes from onEnd
                console.log("onUpdate:\ndragged el:");
                console.log(evt.item);
            },

            // Called by any change to the list (add / update / remove)
            onSort: function (/**Event*/evt) {
                // same properties as onUpdate
                console.log("onSort:\ndragged el:");
                console.log(evt.item);
            },

            // Element is removed from the list into another list
            onRemove: function (/**Event*/evt) {
                // same properties as onUpdate
                console.log("onRemove:\ndragged el:");
                console.log(evt.item);
            }
});

//Sortable for stickers on cards.
$('#boardCards .stickers').each(function (i,e){
    Sortable.create(e, {
        group: 'blocks',
        animation: 150,

    // Element is chosen
        onChoose: function (/**Event*/evt) {
            console.log("onChoose:\noldIndex = " + evt.oldIndex);  // element index within parent
        },

        // Element dragging started
        onStart: function (/**Event*/evt) {
            console.log("onStart:\noldIndex = " + evt.oldIndex);  // element index within parent
        },

        // Element dragging ended
        onEnd: function (/**Event*/evt) {
            console.log("onEnd:");
            console.log("oldIndex = " + evt.oldIndex);  // element's old index within parent
            console.log("newIndex = " + evt.newIndex);  // element's new index within parent
        },

        // Element is dropped into the list from another list
        onAdd: function (/**Event*/evt) {
            var itemEl = evt.item;  // dragged HTMLElement
            evt.from;  // previous list
            // + indexes from onEnd
            console.log("onAdd:\ndragged el:");
            console.log(evt.item);
            console.log("previous list:");
            console.log(evt.from);
            console.log("event:");
            console.log(evt);
        },

        // Changed sorting within list
        onUpdate: function (/**Event*/evt) {
            var itemEl = evt.item;  // dragged HTMLElement
            // + indexes from onEnd
            console.log("onUpdate:\ndragged el:");
            console.log(evt.item);
        },

        // Called by any change to the list (add / update / remove)
        onSort: function (/**Event*/evt) {
            // same properties as onUpdate
            console.log("onSort:\ndragged el:");
            console.log(evt.item);
        },

        // Element is removed from the list into another list
        onRemove: function (/**Event*/evt) {
            // same properties as onUpdate
            console.log("onRemove:\ndragged el:");
            console.log(evt.item);
        }
    });
});