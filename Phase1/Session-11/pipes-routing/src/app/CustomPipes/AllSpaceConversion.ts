import { Pipe, PipeTransform } from "@angular/core";

@Pipe({name:'convertSpace'})
export class AllSpaceConversion implements PipeTransform{
    
    transform(value: string, char: string) {
        return value.split(' ').join(char);
    }
}