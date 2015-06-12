angular.module('myApp').service('EntryService', function ($http, $log) {
    var prefix = '/journal';

    this.saveEntry = function(entry){
        return $http({
            method: 'POST',
            data: entry,
            url: prefix+'/api/entries'
        });
    };

    //this.getAllWords = function (){
    //    return $http({
    //        method: 'GET',
    //        url: prefix+'/api/words'
    //    });
    //};
    //
    //this.getWordLevels = function (){
    //    return $http({
    //        method: 'GET',
    //        url: prefix+'/api/words/levels'
    //    });
    //};
    //this.getWordsForLevel = function (level){
    //    return $http({
    //        method: 'GET',
    //        url: prefix+'/api/words/'+level
    //    });
    //};
    //
    //this.deleteWord = function(praise){
    //    return $http({
    //        method: 'DELETE',
    //        params: {
    //            id: praise.id
    //        },
    //        url: prefix+'/api/words'
    //    });
    //}

});