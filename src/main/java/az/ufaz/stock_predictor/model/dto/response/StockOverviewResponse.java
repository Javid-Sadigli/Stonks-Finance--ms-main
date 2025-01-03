package az.ufaz.stock_predictor.model.dto.response;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class StockOverviewResponse
{
    @JsonProperty(value = "stock_name")
    private String stockName;
    private String change;
    
    @JsonProperty(value = "current_price")
    private double currentPrice;
}