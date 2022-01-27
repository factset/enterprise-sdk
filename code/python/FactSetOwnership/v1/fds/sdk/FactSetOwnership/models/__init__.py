# flake8: noqa

# import all models into this package
# if you have many models here with many references from one model to another this may
# raise a RecursionError
# to avoid this, import only the models that you directly need like:
# from from fds.sdk.FactSetOwnership.model.pet import Pet
# or import this package, but before doing it, use:
# import sys
# sys.setrecursionlimit(n)

from fds.sdk.FactSetOwnership.model.asset_type import AssetType
from fds.sdk.FactSetOwnership.model.error_response import ErrorResponse
from fds.sdk.FactSetOwnership.model.error_response_sub_errors import ErrorResponseSubErrors
from fds.sdk.FactSetOwnership.model.fund_holding import FundHolding
from fds.sdk.FactSetOwnership.model.fund_holdings_request import FundHoldingsRequest
from fds.sdk.FactSetOwnership.model.fund_holdings_response import FundHoldingsResponse
from fds.sdk.FactSetOwnership.model.holder_type import HolderType
from fds.sdk.FactSetOwnership.model.id_fund_holdings import IdFundHoldings
from fds.sdk.FactSetOwnership.model.id_holders import IdHolders
from fds.sdk.FactSetOwnership.model.security_holders import SecurityHolders
from fds.sdk.FactSetOwnership.model.security_holders_request import SecurityHoldersRequest
from fds.sdk.FactSetOwnership.model.security_holders_response import SecurityHoldersResponse
