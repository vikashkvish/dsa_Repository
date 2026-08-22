/**
 * @param {*} obj
 * @param {*} classFunction
 * @return {boolean}
 */
var checkIfInstanceOf = function(obj, classFunction) {
    if(typeof classFunction !== 'function') return false;
    if(obj === null || obj === undefined) return false;

    let proto = Object(obj);
    const targetPrototype = classFunction.prototype;
    while(proto !== null ){
        proto = Object.getPrototypeOf(proto);
        if(proto === targetPrototype){
            return true;
        }
        
    }
    return false;
};

/**
 * checkIfInstanceOf(new Date(), Date); // true
 */