/**
 * FactSet Search Answers API
 * The FactSet Search Answers API provides answers to search queries, reflecting the data shown within FactSet Search Answers, and allowing you to easily add financial data to your widgets, lookups, bots, and assistants. The API understands a fixed amount of search terms and returns structured data from FactSet’s many data sources. Possible answers include Price of a Company, Top 10 Year-to-Date Gainers, Revenue per Passenger Mile, and many more.
 *
 * The version of the OpenAPI document: 1.1.0
 * Contact: api@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */

import ApiClient from '../ApiClient';
import CountryID from './CountryID';
import Fdc3Country from './Fdc3Country';
import Fdc3Instrument from './Fdc3Instrument';

/**
 * The Fdc3Context model module.
 * @module model/Fdc3Context
 */
class Fdc3Context {
    /**
     * Constructs a new <code>Fdc3Context</code>.
     * @alias module:model/Fdc3Context
     * @implements module:model/Fdc3Instrument
     * @implements module:model/Fdc3Country
     * @param type {String} 
     * @param name {String} 
     */
    constructor(type, name) { 
        Fdc3Instrument.initialize(this, type, name);Fdc3Country.initialize(this, type, name);
        Fdc3Context.initialize(this, type, name);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj, type, name) { 
        obj['type'] = type;
        obj['name'] = name;
    }

    /**
     * Constructs a <code>Fdc3Context</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/Fdc3Context} obj Optional instance to populate.
     * @return {module:model/Fdc3Context} The populated <code>Fdc3Context</code> instance.
     */
    static constructFromObject(data, obj) {
        switch (data['type']) {
            case 'fdc3.country':
              return Fdc3Country.constructFromObject(data, obj);
            case 'fdc3.instrument':
              return Fdc3Instrument.constructFromObject(data, obj);
        }
        return obj;
    }


}

/**
 * @member {String} type
 */
Fdc3Context.prototype['type'] = undefined;

/**
 * @member {String} name
 */
Fdc3Context.prototype['name'] = undefined;

/**
 * @member {String} exchangeMic
 */
Fdc3Context.prototype['exchangeMic'] = undefined;

/**
 * @member {String} exchangeMicFds
 */
Fdc3Context.prototype['exchangeMicFds'] = undefined;

/**
 * @member {module:model/CountryID} id
 */
Fdc3Context.prototype['id'] = undefined;


// Implement Fdc3Instrument interface:
/**
 * @member {String} type
 */
Fdc3Instrument.prototype['type'] = undefined;
/**
 * @member {String} name
 */
Fdc3Instrument.prototype['name'] = undefined;
/**
 * @member {String} exchangeMic
 */
Fdc3Instrument.prototype['exchangeMic'] = undefined;
/**
 * @member {String} exchangeMicFds
 */
Fdc3Instrument.prototype['exchangeMicFds'] = undefined;
/**
 * @member {module:model/InstrumentID} id
 */
Fdc3Instrument.prototype['id'] = undefined;
// Implement Fdc3Country interface:
/**
 * @member {String} type
 */
Fdc3Country.prototype['type'] = undefined;
/**
 * @member {String} name
 */
Fdc3Country.prototype['name'] = undefined;
/**
 * @member {module:model/CountryID} id
 */
Fdc3Country.prototype['id'] = undefined;




export default Fdc3Context;

