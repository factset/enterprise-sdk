/**
 * PA Engine API
 * Allow clients to fetch Analytics through APIs.
 *
 * The version of the OpenAPI document: 3.15.6
 * Contact: api@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */

import ApiClient from '../ApiClient';
import PACalculationColumn from './PACalculationColumn';
import PACalculationDataSources from './PACalculationDataSources';
import PACalculationGroup from './PACalculationGroup';
import PADateParameters from './PADateParameters';
import PAIdentifier from './PAIdentifier';
import TemplateContentTypes from './TemplateContentTypes';

/**
 * The UnlinkedPATemplateUpdateParameters model module.
 * @module model/UnlinkedPATemplateUpdateParameters
 */
class UnlinkedPATemplateUpdateParameters {
    /**
     * Constructs a new <code>UnlinkedPATemplateUpdateParameters</code>.
     * @alias module:model/UnlinkedPATemplateUpdateParameters
     */
    constructor() { 
        
        UnlinkedPATemplateUpdateParameters.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>UnlinkedPATemplateUpdateParameters</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/UnlinkedPATemplateUpdateParameters} obj Optional instance to populate.
     * @return {module:model/UnlinkedPATemplateUpdateParameters} The populated <code>UnlinkedPATemplateUpdateParameters</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new UnlinkedPATemplateUpdateParameters();

            if (data.hasOwnProperty('description')) {
                obj['description'] = ApiClient.convertToType(data['description'], 'String');
            }
            if (data.hasOwnProperty('accounts')) {
                obj['accounts'] = ApiClient.convertToType(data['accounts'], [PAIdentifier]);
            }
            if (data.hasOwnProperty('benchmarks')) {
                obj['benchmarks'] = ApiClient.convertToType(data['benchmarks'], [PAIdentifier]);
            }
            if (data.hasOwnProperty('columns')) {
                obj['columns'] = ApiClient.convertToType(data['columns'], [PACalculationColumn]);
            }
            if (data.hasOwnProperty('dates')) {
                obj['dates'] = PADateParameters.constructFromObject(data['dates']);
            }
            if (data.hasOwnProperty('groups')) {
                obj['groups'] = ApiClient.convertToType(data['groups'], [PACalculationGroup]);
            }
            if (data.hasOwnProperty('datasources')) {
                obj['datasources'] = PACalculationDataSources.constructFromObject(data['datasources']);
            }
            if (data.hasOwnProperty('currencyisocode')) {
                obj['currencyisocode'] = ApiClient.convertToType(data['currencyisocode'], 'String');
            }
            if (data.hasOwnProperty('componentdetail')) {
                obj['componentdetail'] = ApiClient.convertToType(data['componentdetail'], 'String');
            }
            if (data.hasOwnProperty('content')) {
                obj['content'] = TemplateContentTypes.constructFromObject(data['content']);
            }
        }
        return obj;
    }


}

/**
 * Template description
 * @member {String} description
 */
UnlinkedPATemplateUpdateParameters.prototype['description'] = undefined;

/**
 * List of accounts
 * @member {Array.<module:model/PAIdentifier>} accounts
 */
UnlinkedPATemplateUpdateParameters.prototype['accounts'] = undefined;

/**
 * List of benchmarks
 * @member {Array.<module:model/PAIdentifier>} benchmarks
 */
UnlinkedPATemplateUpdateParameters.prototype['benchmarks'] = undefined;

/**
 * List of columns for the PA calculation
 * @member {Array.<module:model/PACalculationColumn>} columns
 */
UnlinkedPATemplateUpdateParameters.prototype['columns'] = undefined;

/**
 * @member {module:model/PADateParameters} dates
 */
UnlinkedPATemplateUpdateParameters.prototype['dates'] = undefined;

/**
 * List of groupings for the PA calculation
 * @member {Array.<module:model/PACalculationGroup>} groups
 */
UnlinkedPATemplateUpdateParameters.prototype['groups'] = undefined;

/**
 * @member {module:model/PACalculationDataSources} datasources
 */
UnlinkedPATemplateUpdateParameters.prototype['datasources'] = undefined;

/**
 * Currency ISO code for calculation.
 * @member {String} currencyisocode
 */
UnlinkedPATemplateUpdateParameters.prototype['currencyisocode'] = undefined;

/**
 * PA storage type. It can be GROUPS or GROUPSALL or TOTALS or SECURITIES.
 * @member {String} componentdetail
 */
UnlinkedPATemplateUpdateParameters.prototype['componentdetail'] = undefined;

/**
 * @member {module:model/TemplateContentTypes} content
 */
UnlinkedPATemplateUpdateParameters.prototype['content'] = undefined;






export default UnlinkedPATemplateUpdateParameters;

