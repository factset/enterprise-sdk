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
import RankedTableRow from './RankedTableRow';

/**
 * The RankedTable model module.
 * @module model/RankedTable
 */
class RankedTable {
    /**
     * Constructs a new <code>RankedTable</code>.
     * @alias module:model/RankedTable
     * @param rows {Array.<module:model/RankedTableRow>} 
     */
    constructor(rows) { 
        
        RankedTable.initialize(this, rows);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj, rows) { 
        obj['rows'] = rows;
    }

    /**
     * Constructs a <code>RankedTable</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/RankedTable} obj Optional instance to populate.
     * @return {module:model/RankedTable} The populated <code>RankedTable</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new RankedTable();

            if (data.hasOwnProperty('headers')) {
                obj['headers'] = ApiClient.convertToType(data['headers'], ['String']);
            }
            if (data.hasOwnProperty('rows')) {
                obj['rows'] = ApiClient.convertToType(data['rows'], [RankedTableRow]);
            }
        }
        return obj;
    }


}

/**
 * @member {Array.<String>} headers
 */
RankedTable.prototype['headers'] = undefined;

/**
 * @member {Array.<module:model/RankedTableRow>} rows
 */
RankedTable.prototype['rows'] = undefined;






export default RankedTable;

