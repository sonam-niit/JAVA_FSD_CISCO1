import { Directive, ElementRef, Renderer2 } from "@angular/core";

@Directive({
    selector:'[highlight]'
})
export class HighlightDirective{
    //initialized 2 values in my constructor
    constructor(el:ElementRef,render:Renderer2){
        render.setStyle(el.nativeElement,'background-color','yellow')
    }
}